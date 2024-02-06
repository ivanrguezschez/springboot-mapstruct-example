package com.irs.springbootmapstructexample.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.irs.springbootmapstructexample.dto.AuthorAllDto;
import com.irs.springbootmapstructexample.dto.AuthorDto;
import com.irs.springbootmapstructexample.dto.BookDto;
import com.irs.springbootmapstructexample.dto.BookSlimDto;
import com.irs.springbootmapstructexample.dto.CustomerGetDto;
import com.irs.springbootmapstructexample.dto.CustomerPostDto;
import com.irs.springbootmapstructexample.dto.UserGetDto;
import com.irs.springbootmapstructexample.dto.UserPostDto;
import com.irs.springbootmapstructexample.entities.Author;
import com.irs.springbootmapstructexample.entities.Book;
import com.irs.springbootmapstructexample.entities.Customer;
import com.irs.springbootmapstructexample.entities.User;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

	CustomerGetDto customerToCustomerGetDto(Customer customer);

	Customer customerPostDtoToCustomer(CustomerPostDto customerPostDto);

	BookSlimDto bookToBookSlimDto(Book book);

	BookDto bookToBookDto(Book book);

	AuthorDto authorToAuthorDto(Author author);

	AuthorAllDto authorToAuthorAllDto(Author author);

	List<AuthorAllDto> authorsToAuthorAllDtos(List<Author> authors);

	UserGetDto userToUserGetDto(User user);

	User userPostDtoToUser(UserPostDto userPostDto);
}
