Camelry Soldier's Encoded Message

Create a function named encodeMessage that receives message as its parameter.

This function encodes a secret message by reversing each word, except those containing the letter 's'.

Split the message string into words. For each word, if it contains 's',
leave it as is; otherwise, reverse it. Join the processed words back together, preserving the original order and spaces.

Parameters:

message (String): The soldier's original message containing only lowercase letters and spaces.
The function returns a String representing the encoded message.

---

### **Anotações - encodeMessage**

#### **Requisitos**
- A função `encodeMessage` recebe uma string (`message`).
- Deve inverter cada palavra, **exceto aquelas que contêm a letra 's'**.
- Deve preservar a ordem das palavras e os espaços originais.

---

### **Casos de Teste**

#### **Caso 1**
**Argument:**  
`hello`  

**Output:**  
`olleh`  

**Expected Output:**  
`olleh`  

---

#### **Caso 2**
**Argument:**  
`stay safe`  

**Output:**  
`stay safe`  

**Expected Output:**  
`stay safe`  

---

#### **Caso 3**
**Argument:**  
`ym eman si nhoj`  

**Output:**  
`my name si john`  

**Expected Output:**  
`my name si john`  

---

#### **Caso 4**
**Argument:**  
`ew era sreidlos gnithgif rof ruo yrtnuoc`  

**Output:**  
`we are sreidlos fighting for our country`  

**Expected Output:**  
`we are sreidlos fighting for our country`  

---

#### **Caso 5**
**Argument:**  
`esaelp dnes erom seilppus sa noos sa elbissop`  

**Output:**  
`esaelp dnes more seilppus sa noos sa elbissop`  

**Expected Output:**  
`esaelp dnes more seilppus sa noos sa elbissop`  

---

#### **Caso 6**
**Argument:**  
`ruo noitisop sah neeb desimorp ew era gnitaerter`  

**Output:**  
`our noitisop sah been desimorp we are retreating`  

**Expected Output:**  
`our noitisop sah been desimorp we are retreating`  

---

#### **Caso 7**
**Argument:**  
`eht elttab saw ecreif tub ew degreme suoirotciv`  

**Output:**  
`the battle saw fierce but we emerged suoirotciv`  

**Expected Output:**  
`the battle saw fierce but we emerged suoirotciv`  

---

#### **Caso 8**
**Argument:**  
`i epoh ot ees uoy lla niaga noos stay safe`  

**Output:**  
`i hope to ees you all again noos stay safe`  

**Expected Output:**  
`i hope to ees you all again noos stay safe`