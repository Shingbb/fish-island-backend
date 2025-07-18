package com.cong.fishisland.model.vo.game;

import lombok.Data;

/**
 * 谁是卧底游戏玩家视图对象
 *
 * @author cong
 */
@Data
public class UndercoverPlayerVO {

    /**
     * 玩家ID
     */
    private Long userId;

    /**
     * 玩家角色
     */
    private String role;

    /**
     * 玩家词语
     */
    private String word;

    /**
     * 是否被淘汰
     */
    private Boolean isEliminated;

    /**
     * 已猜词次数（仅卧底猜词模式下有效）
     */
    private Integer guessCount;

    /**
     * 剩余猜词次数（仅卧底猜词模式下有效）
     */
    private Integer remainingGuessCount;
} 