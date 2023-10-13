package br.com.matheus.todolist.task;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);
    // Ao invés de fazer !task.getIdUser().equals(idUser) e, TaskController poderia ser feito:
    // TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}
