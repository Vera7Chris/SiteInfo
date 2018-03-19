package com.huanuo.npo.pojo;

import javax.persistence.*;


    @Entity
    public class MyBook {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private long id;
        private String name;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "book_detail")
        /*
        @JoinColumn重命名了添加的列，如果不指定，添加的列就叫bookDetail
         */
        private BookDetail bookDetail;

        public MyBook() {
        }

        public MyBook(String name, BookDetail bookDetail) {
            this.name = name;
            this.bookDetail = bookDetail;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BookDetail getBookDetail() {
            return bookDetail;
        }

        public void setBookDetail(BookDetail bookDetail) {
            this.bookDetail = bookDetail;
        }
    }



