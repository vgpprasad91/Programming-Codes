flowchart TD
    A[Start] --> B{n < k}
    B -- Yes --> C[Return empty set]
    B -- No --> D[Initialize variables: mapping, a, numbers]
    D --> E[Convert string to numerical values]
    E --> F[Initialize hash_value, hash_set, output]
    F --> G[Loop over substrings]
    G --> H{Is first substring?}
    H -- Yes --> I[Calculate initial hash_value]
    H -- No --> J[Update hash_value]
    J --> K{hash_value in hash_set?}
    I --> K
    K -- Yes --> L[Add substring to output]
    K -- No --> M[Add hash_value to hash_set]
    L --> M
    M --> N[Continue loop]
    N --> O[Return output]
    
    P[main function] --> Q[Initialize inputs_string and inputs_k]
    Q --> R[Loop over inputs_k]
    R --> S[Print input sequence and k]
    S --> T[Call find_repeated_sequences]
    T --> U[Print repeated subsequence]
    U --> V[Continue loop]
    V --> W[End]

    style C fill:#f9f,stroke:#333,stroke-width:4px
    style O fill:#bbf,stroke:#333,stroke-width:4px
    style W fill:#bbf,stroke:#333,stroke-width:4px
