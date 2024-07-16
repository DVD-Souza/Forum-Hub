package challenger.forumHub.topicos;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "topico")
@Entity(name = "Topico")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Topico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    @Column(name = "data")
    private LocalDate dataCriacao;
    private Boolean status;
    private String autor;
    private String curso;

    public Topico(CadTopicoDTO dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = LocalDate.now();
        this.status = true;
        this.autor = dados.autor();
        this.curso = dados.curso();
    }

    public void atualizarInformacoes(AtualTopicoDTO dados) {
        if (dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
        if (dados.status() != null){
            this.status = dados.status();
        }
    }

    public void excluir() {
        this.status = false;
    }
}
