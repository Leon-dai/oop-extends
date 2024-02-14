package com.itheima.a02oopextendsdemo3;

public class Employee {
    private int id;
    private String name;
    private String post;


    public Employee() {
    }

    public Employee(int id, String name, String post) {
        this.id = id;
        this.name = name;
        this.post = post;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return post
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置
     * @param post
     */
    public void setPost(String post) {
        this.post = post;
    }

    public void work(){
        System.out.println("员工在工作");
    }
}
