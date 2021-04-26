package ru.runa.wfe.chat.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Sergey Inyakin
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatMessageFileDto extends ChatDto implements Serializable {
    private Long id;
    private String name;
    private byte[] bytes;

    public ChatMessageFileDto(String name, byte[] bytes) {
        this.name = name;
        this.bytes = bytes;
    }
}
