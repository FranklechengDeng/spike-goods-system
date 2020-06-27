package com.lcss.spikegoodssystem.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * @ClassName ResponseGoodsInformation
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午5:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseOrderInformation implements Serializable {

    private static final long serialVersionUID = -4617583903870052553L;
    @Column
    private String orderId;
    @Column
    private Integer goodsNumber;
    @Column
    private Integer goodsId;
    @Column
    private Integer perPrice;
    @Column
    private Integer totalPrice;
    @Column
    private String states;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
