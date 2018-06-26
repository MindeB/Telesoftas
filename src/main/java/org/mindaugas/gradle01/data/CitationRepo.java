package org.mindaugas.gradle01.data;

import org.springframework.data.repository.CrudRepository;

public interface CitationRepo extends CrudRepository<Citation, Long> {
    Citation findByMessage(String var1);
}
