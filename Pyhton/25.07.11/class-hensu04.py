class Product:
    # Variáveis de classe (compartilhadas por todos os objetos)
    sales = 0
    max_kingaku = 0
    min_kingaku = 1000000

    # Método para avaliar o total de vendas
    @classmethod
    def hyouka_method(cls):
        moji = ''
        # Corrigido: primeiro verificar maior valor
        if Product.sales >= 5000000:
            moji = '売上半減'  # Meia redução (exemplo, texto pode ser adaptado)
        elif Product.sales >= 1000000:
            moji = '売上好調'  # Vendas boas
        else:
            moji = '売上赤字'  # Prejuízo
        return moji

    # Método para buscar índices de maior e menor venda
    @classmethod
    def max_min_method(cls, add_list, c_count):
        indx_max = 0
        indx_min = 0
        for i in range(c_count):
            # Maior valor de venda
            if cls.max_kingaku < add_list[i].kingaku:
                cls.max_kingaku = add_list[i].kingaku
                indx_max = i
            # Menor valor de venda
            if cls.min_kingaku > add_list[i].kingaku:
                cls.min_kingaku = add_list[i].kingaku
                indx_min = i
        return indx_max, indx_min

    # Construtor: inicializa os dados do produto
    def __init__(self, in_no, in_tanka, in_kosu):
        self.sal_no = in_no         # Número do produto
        self.name = ''              # Nome da categoria (será preenchido depois)
        self.tanka = in_tanka      # Preço unitário
        self.kosu = in_kosu        # Quantidade vendida
        self.kingaku = 0           # Valor total (preenchido depois)

    # Método para imprimir informações do produto
    def print_method(self):
        print('---------------------')
        print('商品番号：', self.sal_no)
        print('分類名：', self.name)
        print('単価：', self.tanka)
        print('売上個数：', self.kosu)
        print('売上金額：', self.kingaku)

    # Método para classificar o produto
    def bunrui_method(self):
        b_no = self.sal_no // 1000
        if b_no == 1:
            self.name = 'アウター'
        elif b_no == 2:
            self.name = 'インナー'
        elif b_no == 3:
            self.name = 'ワンピース'
        else:
            self.name = 'パンツ'

    # Método para calcular valor total e atualizar venda total
    def money_method(self):
        self.kingaku = self.tanka * self.kosu
        Product.sales += self.kingaku

# Função para checar número do produto
def chek_method(ch_no):
    nocheck = 0
    while nocheck == 0:
        if 1000 <= ch_no <= 4999:
            nocheck = 1  # Número válido
        else:
            print('商品番号エラー')  # Mensagem de erro
            ch_no = int(input('商品番号＝＞'))
    return ch_no

# Lista para armazenar os produtos
sales_list = []
count = 0
sw = 0

# Loop para receber dados dos produtos
while sw == 0:
    no = int(input('商品番号＝＞'))
    if no == 999:
        sw = 1  # Se digitar 999, finaliza o cadastro
        break
    else:
        s_no = chek_method(no)
        s_tanka = int(input('単価＝＞'))
        s_kosu = int(input('個数＝＞'))
        sales_list.append(Product(s_no, s_tanka, s_kosu))
        count += 1

# Definir categoria (classificação) para cada produto
for add in sales_list:
    add.bunrui_method()

# Calcular valor total de cada produto e atualizar vendas totais
for add in sales_list:
    add.money_method()

# Mostrar todos os produtos cadastrados
print('----売上登録商品----')
for add in sales_list:
    add.print_method()

# Buscar índices do maior e menor produto em vendas
ma, mi = Product.max_min_method(sales_list, count)

# Mostrar produto de maior venda
print()
print('----売上最大値商品----')
sales_list[ma].print_method()

# Mostrar produto de menor venda
print()
print('----売上最小値商品----')
sales_list[mi].print_method()

# Avaliar venda total
uriage = Product.hyouka_method()

print()
print('総売上額：', Product.sales)         # Total geral
print('総売上の評価：', uriage)            # Avaliação final
