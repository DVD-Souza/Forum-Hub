package challenger.forumHub.topicos;

import java.time.LocalDate;

public record ListTopicoDTO(
        Long id,
        String titulo,
        String mensagem,
        LocalDate dataCriacao,
        Boolean status,
        String autor,
        String curso) {
    public ListTopicoDTO(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }
}
