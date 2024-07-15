package med.voll.api.domain.topico;

import java.time.LocalDateTime;
import java.util.Date;

public record DatosListadoTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
    }
}


