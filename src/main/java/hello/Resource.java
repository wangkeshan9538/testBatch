package hello;


import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @Autowired
    JobRepository repo;

    @Autowired
    JobLauncher launcher;

    @GetMapping("show")
    public void showRepositry(){
        repo.
        launcher.
    }
}
