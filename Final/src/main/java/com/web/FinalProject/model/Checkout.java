package com.web.FinalProject.model;

public class Checkout {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column checkout.id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column checkout.total
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer total;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column checkout.id_user
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer idUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column checkout.active
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	private Integer active;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column checkout.id
	 * @return  the value of checkout.id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column checkout.id
	 * @param id  the value for checkout.id
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column checkout.total
	 * @return  the value of checkout.total
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column checkout.total
	 * @param total  the value for checkout.total
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column checkout.id_user
	 * @return  the value of checkout.id_user
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getIdUser() {
		return idUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column checkout.id_user
	 * @param idUser  the value for checkout.id_user
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column checkout.active
	 * @return  the value of checkout.active
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public Integer getActive() {
		return active;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column checkout.active
	 * @param active  the value for checkout.active
	 * @mbg.generated  Wed May 18 19:20:19 ICT 2022
	 */
	public void setActive(Integer active) {
		this.active = active;
	}

	public Checkout(Integer total, Integer idUser, Integer active) {
		super();
		this.total = total;
		this.idUser = idUser;
		this.active = active;
	}

	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Checkout(Integer total) {
		super();
		this.total = total;
	}

	
	
}