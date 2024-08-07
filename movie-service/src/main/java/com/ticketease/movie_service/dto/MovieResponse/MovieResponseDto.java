package com.ticketease.movie_service.dto.MovieResponse;




import java.time.LocalDate;

    public class MovieResponseDto {

        private Long id;
        private String title;
        private String description;
        private String director;
        private String genre;
        private int duration; // duration in minutes
        private LocalDate releaseDate;
        private String imageurl;

        // Getters and Setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public LocalDate getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getImageUrl() {
            return imageurl;
        }

        public void setImageUrl(String imageurl) {
            this.imageurl = imageurl;
        }
    }
cd

