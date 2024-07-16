package challenger.forumHub.topicos;

import jakarta.validation.constraints.NotBlank;

public record CadTopicoDTO(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso){
}
