package com.apoo.dao;

import java.util.List;

import com.apoo.model.Supplier;



public interface SupplierDAO {

	
		public boolean addSupplier(Supplier supplier);
		public boolean deleteSupplier(Supplier supplier);
		public boolean updateSupplier(Supplier supplier);
		public List<Supplier> listSuppliers();
		public Supplier getSupplier(int supplierID);

}
