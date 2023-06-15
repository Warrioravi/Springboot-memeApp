package com.crio.starter.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "memes")
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor
public class MemeEntity {
    @Id
    private long id;
    
    @NotNull
    private String name;
    
    @Indexed(unique = true)
    @NotNull
    private String url;
     
    @NotNull
    private String caption;
}
