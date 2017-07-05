package com.beeva.bankapp.dao.inter;

import com.beeva.bankapp.dao.Cliente;

public interface CuentaDAO {
	public boolean deposito(Cliente cliente, double dinero);
	public boolean retiro(Cliente cliente, double dinero);
}