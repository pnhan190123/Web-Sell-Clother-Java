package com.web.FinalProject.model;

import java.util.Date;

public class Cart {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.product_id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.quantity
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer quantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.size
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private String size;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.user_id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.color
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private String color;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.total
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer total;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.sucess
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer sucess;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.time
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Date time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.id_checkout
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer idCheckout;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.id
	 * @return  the value of cart.id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.id
	 * @param id  the value for cart.id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.product_id
	 * @return  the value of cart.product_id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.product_id
	 * @param productId  the value for cart.product_id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.quantity
	 * @return  the value of cart.quantity
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.quantity
	 * @param quantity  the value for cart.quantity
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.size
	 * @return  the value of cart.size
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public String getSize() {
		return size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.size
	 * @param size  the value for cart.size
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.user_id
	 * @return  the value of cart.user_id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.user_id
	 * @param userId  the value for cart.user_id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.color
	 * @return  the value of cart.color
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public String getColor() {
		return color;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.color
	 * @param color  the value for cart.color
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.total
	 * @return  the value of cart.total
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.total
	 * @param total  the value for cart.total
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.sucess
	 * @return  the value of cart.sucess
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getSucess() {
		return sucess;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.sucess
	 * @param sucess  the value for cart.sucess
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setSucess(Integer sucess) {
		this.sucess = sucess;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.time
	 * @return  the value of cart.time
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.time
	 * @param time  the value for cart.time
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.id_checkout
	 * @return  the value of cart.id_checkout
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getIdCheckout() {
		return idCheckout;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.id_checkout
	 * @param idCheckout  the value for cart.id_checkout
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setIdCheckout(Integer idCheckout) {
		this.idCheckout = idCheckout;
	}

	public Cart(Integer productId, Integer quantity, String size, Integer userId, String color, Integer total,
			Integer sucess, Date time) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.size = size;
		this.userId = userId;
		this.color = color;
		this.total = total;
		this.sucess = sucess;
		this.time = time;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}




	

	
	
}