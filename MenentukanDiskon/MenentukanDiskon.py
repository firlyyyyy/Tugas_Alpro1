print("MENENTUKAN DISKON".center(45, "="))

harga = int(input("Masukkan harga barang: Rp "))

if harga >= 500000:
    diskon = harga * 0.2
    total = harga - diskon
    print("HASIL".center(45, "="))
    print(f"diskon anda adalah {diskon}")
    print(f"total yang harus dibayar adalah Rp {total}")
elif harga >= 300000:
    diskon = harga * 0.15
    total = harga - diskon
    print("HASIL".center(45, "="))
    print(f"diskon anda adalah {diskon}")
    print(f"total yang harus dibayar adalah Rp {total}")
elif harga >= 100000:
    diskon = harga * 0.1
    total = harga - diskon
    print("HASIL".center(45, "="))
    print(f"diskon anda adalah {diskon}")
    print(f"total yang harus dibayar adalah Rp {total}")
else:
    print("Maaf, anda tidak mendapatkan diskon")
    print(f"total yang harus dibayar adalah Rp {harga}") 