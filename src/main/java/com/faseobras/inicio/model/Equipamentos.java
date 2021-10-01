package com.faseobras.inicio.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.faseobras.inicio.model.dto.FaseDeObrasDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document
@Getter
@Setter
public class Equipamentos {
    
        @Id
        private String id;
        
        private String equipamento;

        @JsonIgnoreProperties("equipamentos")
        @DBRef(lazy = true)
        private List<FaseDeObras> faseDeObras = new ArrayList<>();
        

        public Equipamentos(){}

        public Equipamentos(String id, String equipamento) {
            this.id = id;
            this.equipamento = equipamento;
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
            Equipamentos other = (Equipamentos) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            return true;
        }

        



}
