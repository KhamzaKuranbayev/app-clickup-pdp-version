package uz.pdp.appclickuppdpversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appclickuppdpversion.entity.Attachment;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
