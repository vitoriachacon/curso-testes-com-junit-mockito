package br.com.chacon.domain;

import jakarta.persistence.*;
import lombok.*;

@Data  /*gera construtores, acessores, modificadores, equals and hash code e tostring
            (isso pode tornar a API menos performática se tiver muitos atributos) */
@AllArgsConstructor
@NoArgsConstructor
@Entity /*Informa que é uma entidade, quero que seja criada uma tabela para ela no banco de dados. Caso queira dar outro nome
          no banco, pode colocar @Entity(name = "Nome_que_vc_quer"), caso não ele cria com mesmo nome da classe.  */

public class User {

    @Id //indica que o atributo abaixo vai ser uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valor de geração no banco, o banco vai gerar o ID de forma automática
    private Integer id;

    private String name;

    @Column(unique = true) //indica que o atributo abaixo é uma unique key
    private String email;

    private String password;

}