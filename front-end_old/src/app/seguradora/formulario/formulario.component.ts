import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Seguradora } from '../shared/seguradora';


@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {



  formSeguradora!: FormGroup ;



  constructor() { }

  ngOnInit() {
    this.createForm(new Seguradora());
  }


  createForm( seguradora: Seguradora){
    this.formSeguradora = new FormGroup({
      nome: new FormControl(),
      sexo: new FormControl(),
      cpfCnpj:new FormControl(),
      dataNascimento: new FormControl(),
      telefone: new FormControl(),
      celular: new FormControl(),
      email: new FormControl(),
      endereco: new FormControl(),
      complemento: new FormControl(),
      banco: new FormControl(),
      agencia: new FormControl(),
      conta: new FormControl(),
      cidade: new FormControl(),
      numero: new FormControl(),
      uf: new FormControl(),
      cep: new FormControl(),
      numeroProposta: new FormControl(),
      numeroBeneficio: new FormControl(),
      valorPremio: new FormControl(),
      numeroContaCorrenteCredito: new FormControl(),
      dataEntrada: new FormControl(),
      canalVenda: new FormControl(),
      corretora: new FormControl(),
      statusAtual: new FormControl(),
      motivoCancela: new FormControl(),
      capital: new FormControl(),
      premio: new FormControl(),
      salario: new FormControl(),
      plano: new FormControl(),
      formaPag: new FormControl(),
      dataVencimento: new FormControl(),
      vigencia: new FormControl(),
      dataTransacao: new FormControl(),
      seguradora: new FormControl(),
      origem: new FormControl(),
      
    })


  }


  onSubmit() {
    console.log(this.formSeguradora.value);
  }


  salvar():void{

  }


  buscar(): void{
    
  }


  sair ():void{
    
  }

}
