```mermaid

classDiagram

class Aviao{
    -AL<motor> motor
    -int peso
    -int numeroMaximoTripulantes
    -string modelo
    -int anoDeFabricacao
    
}

class Motor{
    -tipo: String
}

Aviao "1" *-- "1...8" Motor