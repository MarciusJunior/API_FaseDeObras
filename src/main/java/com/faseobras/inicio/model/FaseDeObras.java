package com.faseobras.inicio.model;

import java.util.ArrayList;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document
@Getter
@Setter
public class FaseDeObras {
    
        @Id
        private String id;
        
        private String nomeDaFase;

        
        @DBRef
        private List<Equipamentos> equipamentos = new ArrayList<>();

        public FaseDeObras(){}

        public FaseDeObras(String id, String nomeDaFase) {
            this.id = id;
            this.nomeDaFase = nomeDaFase;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            FaseDeObras other = (FaseDeObras) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            return true;
        }

        

}
