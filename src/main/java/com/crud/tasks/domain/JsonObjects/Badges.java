package com.crud.tasks.domain.JsonObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Badges {
    private int votes;
    @JsonProperty("attachmentsByType")
    private AttachmentsByType attachments;

}
