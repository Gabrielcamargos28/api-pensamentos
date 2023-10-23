package com.angularpensamentos.ApiPensamentos.repository;

import com.angularpensamentos.ApiPensamentos.domain.Pensamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PensamentoRepository extends JpaRepository<Pensamento, Long> {
}
