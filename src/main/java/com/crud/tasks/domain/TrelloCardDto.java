package com.crud.tasks.domain;


import com.crud.tasks.domain.JsonObjects.AttachmentsByType;
import com.crud.tasks.domain.JsonObjects.Badges;
import com.crud.tasks.domain.JsonObjects.Trello;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TrelloCardDto {
    private String name;
    private String description;
    private String pos;
    private String listId;
    private Badges badges;
    private int votes;
    private AttachmentsByType attachments;
    private Trello trello;
    private int board;
    private int card;
}
