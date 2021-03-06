package chobong.movie.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chobong.frontController.ModelAndView;
import chobong.movie.dto.ReviewDTO;
import chobong.movie.service.ReviewService;

@WebServlet("/ReviewInsert")
public class ReviewInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 넘어오는 값 받기
		HttpSession session = request.getSession();
		String memberId = (String)session.getAttribute("memberId");
		String movieCode = request.getParameter("movieCode");
		String reviewSubject = request.getParameter("reviewSubject");
		String reviewContent = request.getParameter("reviewContent");
					//가입일
		String reviewStarPoint = request.getParameter("reviewStarPoint");
					// 카운트
		String reviewPwd = request.getParameter("reviewPwd");
		
		System.out.println("리뷰 등록 = " + memberId+" : " +movieCode+" : " + reviewSubject
								+" : "+ reviewContent+" : " + reviewStarPoint + " : " + reviewPwd );
		
		int result=0;
		if( memberId == null )	{
			result=-1;
		} else {
			// 값 넘어왔나 확인
				
			// reviewContent 부분에 tag( < )를 문자( &lt; )로 변경
			if( reviewContent.contains("<") ) {
				reviewContent = reviewContent.replace("<", "&lt;");
			}
		
			ReviewDTO reviewDTO = new ReviewDTO( null, memberId, movieCode, reviewSubject, reviewContent, 
											null, Integer.parseInt(reviewStarPoint), 0, reviewPwd);
			// DB에 넣기		
			try {
				result = ReviewService.insert(reviewDTO);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		PrintWriter out = response.getWriter();
		out.print(result);
		
	}
}
