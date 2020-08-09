package br.com.dasa.laboratorymanage.model;

import javax.persistence.*;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    private String name;
    @Enumerated(EnumType.STRING)
    private ExamType examType;
    @Enumerated(EnumType.STRING)
    private ExamStatus examStatus = ExamStatus.ATIVO;

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public ExamType getExamType() {
        return examType;
    }

    public ExamStatus getExamStatus() {
        return examStatus;
    }
}
