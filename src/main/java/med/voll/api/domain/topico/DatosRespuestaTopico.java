package med.voll.api.domain.topico;

import java.time.LocalDateTime;
import java.util.Date;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion) {
    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
    }
}
