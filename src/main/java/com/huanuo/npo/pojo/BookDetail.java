package com.huanuo.npo.pojo;

import javax.persistence.*;

@Entity
public class BookDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private long numberOfPages;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "bookDetail")
    /*
     @OneToOne定义了两个实体之间一对一的关系  ；
     mappedBy：说明由Book来维护两个表的关系，实体类Book对本类的引用字段是"bookDetail"；
    JPA会在Book表中新增加一列bookDetail，值是BookDetail中的主键值；
     */
    private MyBook myBook;

    public BookDetail() {
    }

    public BookDetail(long numberOfPages, MyBook myBook) {
        this.numberOfPages = numberOfPages;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(long numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public MyBook getMyBook() {
        return myBook;
    }

    public void setMyBook(MyBook myBook) {
        this.myBook = myBook;
    }
}

