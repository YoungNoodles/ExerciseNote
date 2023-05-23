package pojo;

public class Brand {
    private Integer id;
    private String brand;
    private String company;
    private Integer ordered;
    private String description;
    private Integer status = null;


    public Brand() {
    }

    public Brand(Integer id, String brand, String company, Integer ordered, String description, Integer status) {
        this.id = id;
        this.brand = brand;
        this.company = company;
        this.ordered = ordered;
        this.description = description;
        this.status = status;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取
     * @return
     */
    public Integer getOrdered() {
        return ordered;
    }

    /**
     * 设置
     * @param ordered
     */
    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String toString() {
        return "Brand{id = " + id + ", brand = " + brand + ", company = " + company + ", description = " + description + ", status = " + status + "}";
    }
}
