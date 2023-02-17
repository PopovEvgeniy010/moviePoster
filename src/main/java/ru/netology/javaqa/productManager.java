package ru.netology.javaqa;


    public class productManager {
        private String[] movie = new String[0];
        private int limitManager;

        public productManager() {
            this.limitManager = 10;
        }

        public productManager(int limitManager) {
            this.limitManager = limitManager;
        }

        public void addFilm(String film) {
            String[] tmp = new String[movie.length + 1];
            for (int i = 0; i < movie.length; i++) {
                tmp[i] = movie[i];
            }
            tmp[tmp.length - 1] = film;
            movie = tmp;
        }

        public String[] findAll() {
            return movie;
        }


        public String[] findLast() {
            int resultLength;
            if (movie.length < limitManager) {
                resultLength = movie.length;
            } else {
                resultLength = limitManager;
            }
            String[] tmp = new String[resultLength];
            for (int i = 0; i < movie.length; i++) {
                tmp[i] = movie[movie.length - 1 - i];
            }
            return tmp;
        }
    }


