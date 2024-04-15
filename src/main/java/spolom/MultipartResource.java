package spolom;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;
import org.jboss.resteasy.reactive.multipart.FileUpload;

@Path("multipart")
public class MultipartResource {
    @Inject
    Logger log;

    @POST
    public void multipart(@RestForm String description,
            @RestForm("image") FileUpload file) {
        log.infov("description: {0}", description);
        log.infov("file info: {0}", file);
    }
}
