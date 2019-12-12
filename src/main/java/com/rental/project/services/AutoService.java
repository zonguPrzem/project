package com.rental.project.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.rental.project.dtos.AutoRegistration;
import com.rental.project.model.Auto;
import com.rental.project.model.Image;
import com.rental.project.repositories.AutoRepository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;
@Service
public class AutoService {

    private final AutoRepository autoRepository;
    private final SecurityService securityService;

    public AutoService(AutoRepository autoRepository, SecurityService securityService) {
        this.autoRepository = autoRepository;
        this.securityService = securityService;
    }
//
//    public Page<AutoView>findAutoViews(Pageable page) {
//        return autoRepository.findAutoViews(page);
//    }
//
//    public Page<AutoView> findAutoViewsByUserId(Long userId, Pageable page) {
//        return autoRepository.findAutoViewsById(userId, page);
//    }

    private List<Image> processImages(MultipartFile[] files) {
        return Arrays.stream(files)
                .filter(not(MultipartFile::isEmpty))
                .map(file -> {
                    try {
                        var bytes = file.getBytes();
                        if (ContentService.isImage(bytes)) {
                            return new Image(
                                    file.getOriginalFilename(),
                                    bytes,
                                    file.getContentType(),
                                    file.getSize()
                            );
                        } else {
                            throw new AccessDeniedException("Illegal mime type for image.");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());
    }

    public Auto createAuto(AutoRegistration autoRegistration) {
        var auto = new Auto();
        auto.setMarka(autoRegistration.getMarka());
        auto.setModel(autoRegistration.getModel());
        auto.setTyp_nadwozia(autoRegistration.getTyp_nadwozia());
        auto.setKolor(autoRegistration.getKolor());
        auto.setPrzebieg(autoRegistration.getPrzebieg());
        auto.setRocznik(autoRegistration.getRocznik());
        auto.setKwota(autoRegistration.getKwota());
        auto.setStatus(autoRegistration.getStatus());

        Auto.setModel(securityService.getLoggedInUser());
        processImages(AutoRegistration.getFiles()).forEach(Auto::addImage);
        return autoRepository.save(auto);
    }

}
