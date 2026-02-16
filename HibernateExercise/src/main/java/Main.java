
import java.time.LocalDateTime;

import com.aitrich.DAO.*;
import com.aitrich.Entity.*;
import com.aitrich.Util.JPAUtil;

import jakarta.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        CompanyDAO companyDAO = new CompanyDAO(em);
        JobDAO jobDAO = new JobDAO(em);
        JobSeekerDAO seekerDAO = new JobSeekerDAO(em);
        ApplicationDAO applicationDAO = new ApplicationDAO(em);

        Company company = new Company();
        company.setName("Aitrich Technologies");
        company.setLocation("Kochi");
        company.setIndustry("IT");
        companyDAO.save(company);

        Job job = new Job();
        job.setTitle("Java Developer");
        job.setDescription("Spring + JPA required");
        job.setCompany(company);
        job.setPostedDate(LocalDateTime.now());
        jobDAO.save(job);

        JobSeeker seeker = new JobSeeker();
        seeker.setName("Abijith");
        seeker.setEmail("abijith@gmail.com");
        seeker.setSkill("Java, Hibernate");
        seekerDAO.save(seeker);

        Application application = new Application();
        application.setJob(job);
        application.setJobSeeker(seeker);
        application.setApplicationDate(LocalDateTime.now());
        application.setStatus(true);
        applicationDAO.save(application);

        System.out.println("Applications by seeker:");
        applicationDAO.findByJobSeeker(seeker.getId())
                .forEach(a -> System.out.println(a.getJob().getTitle()));

        System.out.println("Applicants for job:");
        applicationDAO.findApplicantsForJob(job.getId())
                .forEach(s -> System.out.println(s.getName()));

        em.close();
        System.out.println("Done.");
    }
}
