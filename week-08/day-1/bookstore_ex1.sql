SELECT book_name, author.aut_name, category.cate_descrip, publisher.pub_name, book_price
 FROM author, book_mast, category, publisher
 WHERE book_mast.cate_id = category.cate_id AND book_mast.aut_id = author.aut_id AND book_mast.pub_id = publisher.pub_id;