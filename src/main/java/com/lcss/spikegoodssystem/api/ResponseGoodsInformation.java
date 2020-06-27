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
public class ResponseGoodsInformation implements Serializable {

    private static final long serialVersionUID = -5188040397452719674L;
    
    private String goodsId;
    
    private Integer goodsNumber;
    
    private Integer goodsPrice;
    
    private String description;
    
    private String goodsName;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
