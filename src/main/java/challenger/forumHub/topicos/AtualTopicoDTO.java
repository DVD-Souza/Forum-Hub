package challenger.forumHub.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualTopicoDTO(
        @NotNull
        Long id,
        String titulo,
        String mensagem,
        Boolean status){
}
