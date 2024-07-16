package foro.hub.api.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String usuario, String titulo, String mensaje, LocalDateTime fechaCreacion) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getUsuario(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
    }
}


