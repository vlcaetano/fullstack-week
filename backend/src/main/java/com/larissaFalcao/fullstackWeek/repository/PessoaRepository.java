package com.larissaFalcao.fullstackWeek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larissaFalcao.fullstackWeek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
