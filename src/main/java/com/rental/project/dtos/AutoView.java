package com.rental.project.dtos;

import java.util.Objects;

public class AutoView {

        private final long id;
        private final String title;
        private final int autoModel;

        public AutoView(long id, String title, int autoModel) {
            this.id = id;
            this.title = title;
            this.autoModel = autoModel;
        }

        public String getTitle() {
            return title;
        }

        public int getAutoModel() {
            return autoModel;
        }

        public long getId() {
            return id;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoView autoView = (AutoView) o;
        return id == autoView.id &&
                autoModel == autoView.autoModel &&
                Objects.equals(title, autoView.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, autoModel);
    }

    @Override
    public String toString() {
        return "AutoView{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autoModel=" + autoModel +
                '}';
    }
}

