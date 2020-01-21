import { Injectable } from '@angular/core';
import { Contract } from './contracts';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  selectedContractToUpdate: Contract;

  api = 'http://localhost:8080/fmsboot';

  constructor(private http: HttpClient) { }

  postData(contract: Contract): Observable<any> {
    return this.http.post<any>(`${this.api}/addContract`, contract);
  }

  getData(): Observable<any> {
    return this.http.post<any>(`${this.api}/getAllContracts`, {});
  }

  deleteData(contract): Observable<any> {
    return this.http.delete<any>(`${this.api}/deleteContract/${contract.contractId}`);
  }

  updateData(contract): Observable<any> {
    return this.http.put<any>(
      `${this.api}/updateContract`, contract);
  }
}
