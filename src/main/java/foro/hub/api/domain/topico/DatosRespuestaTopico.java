package foro.hub.api.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id,String usuario, String titulo, String mensaje, LocalDateTime fechaCreacion) {
    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getUsuario(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
    }
}
