package org.qiyu.live.gift.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class RedPacketConfigRespDTO implements Serializable {


    @Serial
    private static final long serialVersionUID = 4000531632562751296L;
    private Long anchorId;
    private Integer totalPrice;
    private Integer totalCount;
    private String configCode;
    private String remark;
}