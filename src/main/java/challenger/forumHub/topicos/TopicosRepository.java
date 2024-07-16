package challenger.forumHub.topicos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicosRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findAllByStatusTrue(Pageable paginacao);

}
