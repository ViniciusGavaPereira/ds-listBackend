package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import projections.GameMinProjection;

public class GameMinDTO {
    
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
		title = projection.getTitle();
		year = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    
    
}
