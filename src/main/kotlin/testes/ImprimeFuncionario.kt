package testes

import classesAbstracts.Funcionario

class ImprimeFuncionario {
    companion object{
        fun imprime(func : Funcionario) = println(func.toString());
    }
}