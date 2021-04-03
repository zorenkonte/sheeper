package com.darkmode.sheeper.repository;

import com.darkmode.sheeper.model.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
}
