package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 眼镜订单
 *
 * @author 
 * @email
 */
@TableName("yanjing_order")
public class YanjingOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YanjingOrderEntity() {

	}

	public YanjingOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "yanjing_order_uuid_number")

    private String yanjingOrderUuidNumber;


    /**
     * 收货地址
     */
    @TableField(value = "address_id")

    private Integer addressId;


    /**
     * 眼镜
     */
    @TableField(value = "yanjing_id")

    private Integer yanjingId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 实付价格
     */
    @TableField(value = "yanjing_order_true_price")

    private Double yanjingOrderTruePrice;


    /**
     * 订单类型
     */
    @TableField(value = "yanjing_order_types")

    private Integer yanjingOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "yanjing_order_payment_types")

    private Integer yanjingOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getYanjingOrderUuidNumber() {
        return yanjingOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setYanjingOrderUuidNumber(String yanjingOrderUuidNumber) {
        this.yanjingOrderUuidNumber = yanjingOrderUuidNumber;
    }
    /**
	 * 设置：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 获取：收货地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：眼镜
	 */
    public Integer getYanjingId() {
        return yanjingId;
    }


    /**
	 * 获取：眼镜
	 */

    public void setYanjingId(Integer yanjingId) {
        this.yanjingId = yanjingId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getYanjingOrderTruePrice() {
        return yanjingOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setYanjingOrderTruePrice(Double yanjingOrderTruePrice) {
        this.yanjingOrderTruePrice = yanjingOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getYanjingOrderTypes() {
        return yanjingOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setYanjingOrderTypes(Integer yanjingOrderTypes) {
        this.yanjingOrderTypes = yanjingOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getYanjingOrderPaymentTypes() {
        return yanjingOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setYanjingOrderPaymentTypes(Integer yanjingOrderPaymentTypes) {
        this.yanjingOrderPaymentTypes = yanjingOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "YanjingOrder{" +
            "id=" + id +
            ", yanjingOrderUuidNumber=" + yanjingOrderUuidNumber +
            ", addressId=" + addressId +
            ", yanjingId=" + yanjingId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", yanjingOrderTruePrice=" + yanjingOrderTruePrice +
            ", yanjingOrderTypes=" + yanjingOrderTypes +
            ", yanjingOrderPaymentTypes=" + yanjingOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
